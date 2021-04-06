import com.rust.Item.Appeal;
import com.rust.Service.AppealService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired
    AppealService appealService;
    @Test
    public void aow(){
        Appeal appeal = new Appeal();
        appealService.insertAppeal(appeal);
    }

}
