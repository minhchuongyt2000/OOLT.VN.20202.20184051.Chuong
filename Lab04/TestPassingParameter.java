public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
        swap(jungleDVD,cinderellaDVD);
        System.out.println("Jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: "+cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: "+jungleDVD.getTitle());
        
    }
    public static void swap(DigitalVideoDisc a,DigitalVideoDisc b){
        String t=a.getTitle();
        a.setTitle(b.getTitle());
        b.setTitle(t);
    }
    public static void changeTitle(DigitalVideoDisc o1,String s){
        String oldtitle=o1.getTitle();
        o1.setTitle(s);
        o1=new DigitalVideoDisc(oldtitle);
    }
}
