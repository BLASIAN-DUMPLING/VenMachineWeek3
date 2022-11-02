/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package christina.venmachineweek3;

import christina.venmachineweek3.controller.VendingMachineController;
import christina.venmachineweek3.dao.VendingMachineAuditDao;
import christina.venmachineweek3.dao.VendingMachineAuditDaoImpl;
import christina.venmachineweek3.dao.VendingMachineDao;
import christina.venmachineweek3.dao.VendingMachineDaoImpl;
import christina.venmachineweek3.service.VendingMachinePersistenceException;
import christina.venmachineweek3.service.VendingMachineServiceLayer;
import christina.venmachineweek3.service.VendingMachineServiceLayerImpl;
import christina.venmachineweek3.ui.UserIO;
import christina.venmachineweek3.ui.UserIOImpl;
import christina.venmachineweek3.ui.VendingMachineView;

/**
 *
 * @author chris
 */
public class VenMachineWeek3 {

   
       public static void main(String[] args) throws VendingMachinePersistenceException {
        UserIO myIo = new UserIOImpl();
        VendingMachineView MyView = new VendingMachineView(myIo);
        VendingMachineAuditDao MyAuditDao = new VendingMachineAuditDaoImpl();
        VendingMachineDao MyDao = new VendingMachineDaoImpl();
        VendingMachineServiceLayer MyService = new VendingMachineServiceLayerImpl(MyDao, MyAuditDao);
        VendingMachineController controller = new VendingMachineController(MyView, MyService);
        controller.run();
    }
    }

