package.com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.student;
import com.example.demo.repository.StudentRepository;
import 

@service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdreps;
    @override
    public student poststudent(student st){
        return stdrepo.save(st);
        

    }

}