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
public class Sdept {
    private char sno;
    private char stno;
    private char sname;
    private char tno;

    public char getSno() {
        return sno;
    }

    public void setSno(char sno) {
        this.sno = sno;
    }

    public char getStno() {
        return stno;
    }

    public void setStno(char stno) {
        this.stno = stno;
    }

    public char getSname() {
        return sname;
    }

    public void setSname(char sname) {
        this.sname = sname;
    }

    public char getTno() {
        return tno;
    }

    public void setTno(char tno) {
        this.tno = tno;
    }

    @Override
    public String toString() {
        return "Sdept{" + "sno=" + sno + ", stno=" + stno + ", sname=" + sname + ", tno=" + tno + '}';
    }
    
    
    
}
