
/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-11
 * Time: 9:23
 */
class UserImpl {
     static void main(String[] args) {

         def user = new User()
         user.username='wsy'
         user.password="123456"
         user.sex='男'
         user.address="徐州"
         user.setProperty("username",'王...')
         println(user.toString())

     }
}
