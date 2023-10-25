/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:02 PM
 *   File: UpdateCustomerData
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;

public class UpdateCustomerData {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();

        int id = 1;
        Customer c1 = dao.getCustomerById(id);

        if (c1 == null) {
            System.out.println("No customer data for id: " + id);
        } else {
            System.out.println("Before Updating => " +c1);
            c1.setCity("Varanasi");
            c1.setPhone("8542875214");
            dao.updateCustomer(c1);
            System.out.println("After Updating => " +c1);
        }
    }
}
