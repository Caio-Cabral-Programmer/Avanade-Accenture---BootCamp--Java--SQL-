import br.com.dio.dto.User.UserDTO;
import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public final static void main(String[] args) {

        var model = new UserModel();
        model.setCode(1);
        model.setUsername("James");
        model.setBirthday(LocalDate.now().minusYears(20));
        System.out.println(mapper.toDto(model));

        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Maria");
        dto.setBirthday(LocalDate.now().minusYears(30));
        System.out.println(mapper.toModel(dto));
    }
}
