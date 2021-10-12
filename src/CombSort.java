import java.util.ArrayList;

public class CombSort {

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

    public static void combSort(ArrayList<Personel> personel) {  // sorting process by personnel id
        int gap = personel.size();
        double shrink = 1.3;
        boolean sorted = true;
        while(sorted) {
            gap = (int) Math.floor(gap/shrink);
            if(gap <= 1) {
                gap = 1;
                sorted = false;
            }
            int i = 0;
            while (i+gap < personel.size()) {
                if (personel.get(i).getPersonalId()>personel.get(i+gap).getPersonalId()) {
                    swap(personel.get(i),personel.get(i+gap));
                    sorted = true;
                }
                i += 1;
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
        Personel person1 = new Personel(1,15);
        Personel person2 = new Personel(1,22);
        Personel person3 = new Personel(1,21);
        Personel person4 = new Personel(2,21);
        Personel person5 = new Personel(2,29);
        Personel person6 = new Personel(2,05);
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        person.add(person5);
        person.add(person6);
        combSort(person);
        for (Personel personel : person) {
            System.out.println(personel.getClas()+" "+personel.getPersonalId());
        }

      /*2 5
        1 15
        2 21
        1 21
        1 22
        2 29
            */


    }



}




