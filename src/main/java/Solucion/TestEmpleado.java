package Solucion;
class Empleado{
    private String nombreEmp;
    private double salarioEmp;
    private int edadEmp;
    private double aumentoSalarioEmp;
    public Empleado() {}
    public Empleado(String nombreEmp, int edadEmp, double salarioEmp) {
        this.nombreEmp = nombreEmp;
        this.edadEmp = edadEmp;
        this.salarioEmp = salarioEmp;
    }
    public String getNombreEmp() {
        return nombreEmp;}
    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;}
    public double getSalarioEmp() {
        return salarioEmp;}
    public void setSalarioEmp(double salarioEmp) {
        this.salarioEmp = salarioEmp;}
    public int getEdadEmp() {
        return edadEmp;}
    public void setEdadEmp(int edadEmp) {
        this.edadEmp = edadEmp;}
    public double getAumentoSalarioEmp() {
        return aumentoSalarioEmp;}
    public void setAumentoSalarioEmp(double aumentoSalarioEmp) {
        this.aumentoSalarioEmp = aumentoSalarioEmp;}
    public void calcularSalario(){
        this.salarioEmp = this.salarioEmp + (this.salarioEmp * (aumentoSalarioEmp/100));
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmp=" + nombreEmp + ", salarioEmp=" + salarioEmp + ", edadEmp=" + edadEmp + ", aumentoSalarioEmp=" + aumentoSalarioEmp + '}';
    }
}
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 40, 1000);
        Empleado emp2 = new Empleado("Maria", 40, 500);
        Empleado emp3 = new Empleado("Carlos", 40, 1200);
        int num[] = new int[3];
        Empleado empleados[] = new Empleado[3];
        empleados[0] = emp1;
                
        double promedioSalaria = (emp1.getSalarioEmp() + emp2.getSalarioEmp() + emp3.getSalarioEmp()) / 3;
        System.out.println(promedioSalaria);
        if (emp1.getSalarioEmp()< promedioSalaria){
            emp1.setAumentoSalarioEmp(10);
            emp1.calcularSalario();
        }
        if (emp2.getSalarioEmp() < promedioSalaria){
            emp2.setAumentoSalarioEmp(10);
            emp2.calcularSalario();
        }
        if (emp1.getSalarioEmp() < promedioSalaria){
            emp3.setAumentoSalarioEmp(10);
            emp3.calcularSalario();
        }
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
    }
}
