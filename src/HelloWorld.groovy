import javafx.print.Printer

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-10
 * Time: 14:33
 */

println("Hello world")

for (int i in 1..2) {
    println("黄晓宇是菜鸡    "+i )
}


def s1 = "123"

println(s1);

def aList = [5,'string',false]
println(aList[1])

def fun1 = {
    p1 ->
        def s = "我是一个闭包," + p1
}
println(fun1.call())  //闭包 调用方式1

println(fun1.call("我是一个参数")) //闭包 调用方式2

println(fun1("我是一个参数2"))


def fun2 = {
    it-> "dsdsd"
}

println( fun2.call())