public class Entero
{
  private int num;
  public Entero() { num=0; }
  public Entero(int n) { num=n; }
  public boolean esPar() { 
    if ((num % 2)== 0)
      return true;
     return false;
  }
}
