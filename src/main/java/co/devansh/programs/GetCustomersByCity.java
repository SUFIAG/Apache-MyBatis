/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:50 PM
 *   File: GetCustomersByCity
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;
import java.util.List;

public class GetCustomersByCity {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();

        String city = "Varanasi";
        List<Customer> list = dao.getCustomerByCity(city);
        System.out.println("There are " + list.size() + " customers from " +city);

        for (Customer customer : list) {
            System.out.println(customer);
        }
    }
}
