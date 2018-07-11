/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-10
 * Time: 16:35
 */
class H1 {
    protected  def username;
    protected  def password;
    protected  def sex;
    protected  def address;



    @Override
     String toString() {
        return "H1{" +
                "username=" + username +
                ", password=" + password +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }

    static void main(String[] args) {
        println("123")
        def sum = 0;
        for (i in 1..10) {
            sum += i
        }
        println("1.。10结果为：" + sum)


    }

}
