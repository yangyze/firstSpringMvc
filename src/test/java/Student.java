import com.sun.javafx.runtime.SystemProperties;
import com.yyz.config.StudentConfig;
import com.yyz.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangyeze on 2017/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= StudentConfig.class)
//@ActiveProfiles("pro")
public class Student {
    @Autowired
    private StudentService studentService;

    @Before
    public void begin(){
        System.out.println(" i am going to run a test");
    }
    @Test
    public void save(){

        studentService.save();
    }
}
