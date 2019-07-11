/**
 * Created by perl on 2019/7/11.
 *
 * 1108. Defanging an IP Address
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 * Constraints:
 *
 * The given address is a valid IPv4 address.
 */
public class DefangingAnIPAddress {

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        System.out.println(DefangingAnIPAddress.defangIPaddr("1.1.1.1"));
        System.out.println(DefangingAnIPAddress.defangIPaddr("255.100.50.0"));
    }
}
