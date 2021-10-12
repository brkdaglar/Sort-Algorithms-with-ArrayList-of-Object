import java.util.ArrayList;

public class GnomeSort {

    public static class Personel {

        int personalClas;
        int personalId;

        public Personel(int personalClass,int personalId) {
            this.personalClas = personalClass;
            this.personalId = personalId;
        }

        public void setClas(int personalClass) {
            this.personalClas = personalClass;
        }

        public int getClas() {
            return personalClas;
        }

        public void setPersonalId(int personalId) {
            this.personalId = personalId;
        }

        public int getPersonalId() {
            return personalId;
        }


    }

    public static void gnomeSort(ArrayList<Personel> personell) {
        int pos = 0;
        while(pos<personell.size()) {
            if( (pos==0)|| (personell.get(pos).getPersonalId())>=personell.get(pos-1).getPersonalId()) {
                pos += 1;
            } else {
                swap(personell.get(pos),personell.get(pos-1));
                pos -= 1;
            }
        }
    }
    private static void swap(Personel firstPerson, Personel secondPerson) {  // to replace the two indeces.
        int firstClass = firstPerson.getClas();
        int firstId = firstPerson.getPersonalId();
        int secondClass = secondPerson.getClas();
        int secondId = secondPerson.getPersonalId();
        firstPerson.setClas(secondClass);
        firstPerson.setPersonalId(secondId);
        secondPerson.setClas(firstClass);
        secondPerson.setPersonalId(firstId);

    }


    public static void main(String[] args) {
        ArrayList<Personel> person = new ArrayList<Personel>();
        Personel person1 = new Personel(1,13);
        Personel person2 = new Personel(1,21);
        Personel person3 = new Personel(2,21);
        Personel person5 = new Personel(2,35);
        Personel person6 = new Personel(2,12);
        Personel person7 = new Personel(2,15);

        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person5);
        person.add(person6);
        person.add(person7);
        gnomeSort(person);
        for (Personel personel : person) {
            System.out.println(personel.getClas()+" "+personel.getPersonalId());
        }

        /*2 12
        1 13
        2 15
        1 21
        2 21
        2 35*/


    }

}
