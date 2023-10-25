/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 12:00 AM
 *   File: AddNewCustomer
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;

public class AddNewCustomer {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();

        Customer c1 = new Customer();
        c1.setName("Akanksha");
        c1.setCity("Varanasi");
        c1.setEmail("akanksha123@example.com");
        c1.setPhone("6392623475");

        dao.addCustomer(c1);

        System.out.println(c1);
    }
}
