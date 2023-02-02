/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;

/**
 *
 * @author 泊
 */
public class Test {

    public static void main(String[] args) {
        E_mail E=new E_mail();
        Judge M=new Judge();
    
        M.Judge(E.Sl(), E.Regex());//将E_mail类中的Sl方法返回值和Regex方法返回值，传递给Judge类的构造方法
        }
    
}
