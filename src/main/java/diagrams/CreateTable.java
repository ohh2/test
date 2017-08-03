package diagrams;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;

/**
 * Created by Administrator on 2017/8/3.
 */
public class CreateTable {
    public static  void createTable() {
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();

        System.out.println("------processEngine:" + processEngine);
    }
    public static void deployFlow(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
//        Deployment deployment = processEngine.getRepositoryService().createDeployment().name("≤‚ ‘").addClasspathResource("../diagram/test.bpmn").addClasspathResource("test.png").deploy();
//        System.out.println(deployment.getId());
//        System.out.println(deployment.getName());
    }
    public static void main(String argv[]){
//        createTable();
          deployFlow();
    }
}
