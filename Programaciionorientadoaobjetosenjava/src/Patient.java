public class Patient {
    private String name;
    private String Email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;  //solo se pude  modificar  en la clase
    private double height; //solo se pude  modificar  en la clase
    String blood;

   Patient(String name, String email ){
       this.name= name;
       this.Email =email;
   }
    public void showPatientPersonalData(String name, String Email, String address, String phoneNumber, String birthday){
    this.name=name;
    this.Email= Email;
    this.address= address;
    this.phoneNumber = phoneNumber;
    this.birthday = birthday;

        System.out.println("los  datos   recibidos  son los  siguientes: ");
        System.out.println("nombre  del paciente: "+ name);
        System.out.println("Email: "+ Email);
        System.out.println("direccion de  residencia: "+ address);
        System.out.println("Numero Telefonico: "+ phoneNumber);
        System.out.println("Fecha de  naciemiento: "+birthday);



    }

    public void  showPatientMedicalData(String blood,String weight, double height){

        System.out.println("tipo de  sangre: "+ blood);
        System.out.println(" peso: "+ weight);
        System.out.println("height: "+ height);

    }

    public void setName(String name){
       this.name= name;
    }
    public void setWeight(double weight){
       this.weight= weight;
    }

    public String getWeight(){
       return this.weight + " Kg. ";
    }


}