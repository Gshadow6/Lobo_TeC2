import java.util.ArrayList;

public class ArraySmartTv {
    public static void main(String[] args) {
        ArrayList<SmartTv> televisores = new ArrayList<SmartTv>();
        SmartTv tele1 = new SmartTv(40.0f,"Hisense", new Control("infrarojo", 47));
        SmartTv tele2 = new SmartTv(32.0f,"Sansui", new Control("infrarojo", 50));
        SmartTv tele3 = new SmartTv(65.0f,"Samsung", new Control("infrarojo", 44));
        televisores.add(0,tele1);
        televisores.add(1,tele2);
        televisores.add(2,tele3);

        System.out.println(televisores);
    }
}