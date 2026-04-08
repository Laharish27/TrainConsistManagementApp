import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12_SafetyCheck {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );

        boolean safe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        if (safe)
            System.out.println("Train is Safety Compliant");
        else
            System.out.println("Train is NOT Safe");
    }
}