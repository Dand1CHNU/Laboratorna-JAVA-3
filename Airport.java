package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airport{


    private int numberAirport;
    private String nameAirport;
    private List<Employee> list = new ArrayList<Employee>();

    public int getNumberAirport() {
        return numberAirport;
    }

    public void setNumberAirport(int numberAirport) {
        this.numberAirport = numberAirport;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    public void setNameAirport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public List<Employee> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "numberAirport=" + numberAirport +
                ", nameAirport='" + nameAirport + '\'' +
                ", list=" + list +
                '}';
    }


    //Повертається список працівників, які мають задане ім'я *name*
    public List<Employee> filterByName(List<Employee> list, String name){
        List<Employee> result = new ArrayList<Employee>();

        for(int i = 0; i < list.size();i++){
            if(list.get(i).getName() == name){
                result.add(list.get(i));
            }
        }

        return result;
    }

    //Сортування працівників за віком *age*
    public void sortByAge(List<Employee> list){

        Collections.sort(list, new NewComparable());

        }

       // return list;


    //Підвищення зарплати працівникам, які працюють більше 10 років
    public void UpdateSalary(List<Employee> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getExperience() > 10){
                list.get(i).setSalary(list.get(i).getSalary()*1.25f);
            }
        }

    }


    //Знаходження макс. зарплати
    public Employee MaxSalary(List<Employee> list){
        Employee res = null;
        float temp = list.get(0).getSalary();
        for(int i=1;i<list.size();i++){
            if(list.get(i).getSalary() > temp){
                res = list.get(i);
            }
        }

        return res;
    }

    //Чи є хоча б один один працівник, який є молодше за якийсь вік
    public boolean isYounger(List<Employee> list, int age){

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() < age){
                return true;
            }
        }

        return false;
    }


    //Вивід списку працівників
    public void printfList(List<Employee> list){

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }



    public static void main(String args[]){

        Employee w1 = new Employee();

        w1.setId(1);
        w1.setSurname("Dorosenko");
        w1.setName("Artem");
        w1.setLastname("Panasovych");
        w1.setAge(51);
        w1.setExperience(15);
        w1.setSalary(7500);


        Employee w2 = new Employee();

        w2.setId(2);
        w2.setSurname("Vatin");
        w2.setName("Sasha");
        w2.setLastname("Olehyvna");
        w2.setAge(22);
        w2.setExperience(3);
        w2.setSalary(2400);

        Employee w3 = new Employee();

        w3.setId(3);
        w3.setSurname("Rusnak");
        w3.setName("Vasyl");
        w3.setLastname("Vasylovych");
        w3.setAge(26);
        w3.setExperience(8);
        w3.setSalary(4200);

        Employee w4 = new Employee();


        w4.setId(4);
        w4.setSurname("Krypov");
        w4.setName("Anton");
        w4.setLastname("Denisovych");
        w4.setAge(31);
        w4.setExperience(12);
        w4.setSalary(5300);

        Employee w5 = new Employee();


        w5.setId(5);
        w5.setSurname("Puzenko");
        w5.setName("Yevhen");
        w5.setLastname("Viktoryvna");
        w5.setAge(19);
        w5.setExperience(2);
        w5.setSalary(2000);

        Employee w6 = new Employee();

        w6.setId(6);
        w6.setSurname("Sytenko");
        w6.setName("Antonina");
        w6.setLastname("Valetyvna");
        w6.setAge(44);
        w6.setExperience(19);
        w6.setSalary(6700);


        Employee w7 = new Employee();

        w7.setId(7);
        w7.setSurname("Baluk");
        w7.setName("Ihor");
        w7.setLastname("Andriovych");
        w7.setAge(31);
        w7.setExperience(13);
        w7.setSalary(4600);

        Employee w8 = new Employee();


        w8.setId(8);
        w8.setSurname("Tarasekno");
        w8.setName("Taras");
        w8.setLastname("Shevchinko");
        w8.setAge(40);
        w8.setExperience(16);
        w8.setSalary(8000);


        Airport Airport = new Airport();
        Airport.setNumberAirport(1);
        Airport.setNameAirport("Boruspil");
        List<Employee> l = Airport.getList();

       l.add(w1);
       l.add(w2);
       l.add(w3);
       l.add(w4);
       l.add(w5);
       l.add(w6);
       l.add(w7);
       l.add(w8);

        Airport.sortByAge(l);
        Airport.printfList(l);
        System.out.println("\n\n");
        Airport.printfList(l);

       //Collections.sort(l);  //Сортування по імені по-батькові
        // Airport.printfList(l);
       // Airport.UpdateSalary(l);
       // Airport.printfList(l);
       // System.out.println(Airport.MaxSalary(l));


    }

}
