/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_no_1;

/**
 *
 * @author ACER i7
 */
public class Hewan {
    protected String JenisSuara;
    public Hewan(String jenisSuara) {
        this.JenisSuara = jenisSuara;
                }
    public void bersuara() {
        System.out.println(JenisSuara);
                }
    public boolean isMamalia() {
        return false;
    }
}

