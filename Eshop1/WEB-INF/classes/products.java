
public class products {

   private int barcode;
   private char name;
   private char color;
   private char description;

   public products(int barcode, char name, char color, char description) {
      super( );
      this.barcode = barcode;
      this.name = name;
      this.color = color;
      this.description = description;
   }

   public products( ) {
      super();
   }

   public int getbarcode( ) {
      return barcode;
   }
   
   public void setbarcode(int barcode) {
      this.barcode = barcode;
   }
   
   public char getname( ) {
      return name;
   }
   
   public void setname(char name) {
      this.name = name;
   }

   public char color( ) {
      return color;
   }
   
   public void setcolor(char color) {
      this.color = color;
   }

   public char getdescription( ) {
      return description;
   }
   
   public void setdescription(char description) {
      this.description = description;
   }
   
   @Override
   public String toString() {
      return "products [barcode=" + barcode + ", name=" + name + ", color=" + color + ", description=" + description + "]";
   }
}