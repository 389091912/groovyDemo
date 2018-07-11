/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-11
 * Time: 9:22
 */
class User {
    protected  def username;
    protected  def password;
    protected  def sex;
    protected  def address;



    @Override
    public String toString() {
        return "User{" +
                "username=" + username +
                ", password=" + password +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }
}
