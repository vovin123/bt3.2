nhập  java . sử dụng . Máy quét ;
public  class  danhsachhanghoa {
    Máy quét  sc = Máy quét mới  ( Hệ thống . In );
    int  a ;
    int  b [] = null ;
    public  void  nhaphanghoa () {
         Hanghoa  b [];
            làm {
            Hệ thống . ra ngoài . print ( "nhap so luong hang hoa:" );
            a = sc . nextInt ();
         if ( a <= 0 ) {
            Hệ thống . ra ngoài . print ( "nhap sai yeu cau nhap lai! ko duoc <= 0" );
         }
        } while ( a <= 0 );
        b = new  Hanghoa [ a ];
       for ( int  i = 0 ; i < a ; i ++) {
        Hệ thống . ra ngoài . print ( "hang hoa t" + ( i + 1 ) + ":" );
          b [ i ] = new  Hanghoa ();
       }
       
    }
    public  void  indanhsachhanghoa () {
        int  b [] = null ;
        Hanghoa  b [];
        b =   Hanghoa [ a ];
        for ( int  i = 0 ; i < a ; i ++) {
            Hệ thống . ra ngoài . print ( "hang hoa t" + ( i + 1 ) + ":" );
              b [ i ]. intthanghoa () ;;
           }
    }
    public  static  void  main ( String [] args ) ném  Exception {
        Hanghoa  a = new  Hanghoa ();
        
     }
}