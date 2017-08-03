import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2017/8/3.
 */
public class test {
    @Test
    public  void deployFlow() throws FileNotFoundException {
        String bpmnPath = "D:\\test\\src\\test\\java\\diagrams\\test.bpmn";
        FileInputStream bpmnfileInputStream = new FileInputStream(bpmnPath);
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Deployment deployment = processEngine.getRepositoryService().createDeployment().name("≤‚ ‘").addInputStream("test.bpmn", bpmnfileInputStream).deploy();
        System.out.println(deployment.getId());
        System.out.println(deployment.getName());
    }

}
