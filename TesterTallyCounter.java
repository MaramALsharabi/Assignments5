public class TesterTallyCounter {
    public static void main(String[] args) {
        TallyCounter counter=new TallyCounter();
        counter.get_value();
        counter.set_click();
        counter.set_click();
        counter.get_value();
        System.out.println(counter.undo());
        System.out.println(counter.undo());
        System.out.println(counter.undo());


    }
}
