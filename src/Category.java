public class Category {
   private String  name;
   public int productCount;

   Category(String name){
       this.name = name;
   }

   public void setName(String name){
      this.name = name;
   }
   public String getName(){
      return this.name;
   }

   Product [] array = new Product[1000];

   public void addProduct(Product product){
      array[productCount] = product;

      productCount++;
       System.out.println(productCount);
   }

   public void toSellProduct(Product product){
      array[productCount- 1] = null;
      System.out.println(productCount);
   }
}



