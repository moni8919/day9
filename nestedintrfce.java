import java.util.*;
interface out{
    void outm();
    interface in{
        void innm();
    }

}
class nestedintrfce implements out.in{
    public void innm()
    {
        System.out.println("Hello i'm inner method");

    }
    public static void main(String[] args){
        nestedintrfce h=new nestedintrfce();
        h.innm();
    }
}