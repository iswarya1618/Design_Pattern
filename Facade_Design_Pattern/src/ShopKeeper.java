
public class ShopKeeper {

	private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop onepluse;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
        onepluse=new onepluse();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }  
   public void onepluseSale(){  

	   onepluse.modelNo();  
       onepluse.price();  
        }  
}  


