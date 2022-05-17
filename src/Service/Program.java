package Service;

import Repository.UserRepository;
//import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Program {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        System.out.println(userRepository.getUsers().size());
    }
}
