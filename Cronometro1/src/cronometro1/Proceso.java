package cronometro1;

public class Proceso extends Valores {
    public void avanzar() throws InterruptedException{
        for(mil = 0;mil <= 10 ;mil++){
            Thread.sleep(100);
            System.out.println(h+":"+m+ ":"+s+":"+dec+":"+cen+":"+mil);
            if (mil == 10){
                mil = 0;
                cen ++;
                if (cen == 10){
                    cen = 0;
                    dec++;
                    if (dec == 10){
                        dec = 0;
                        s++;
                        if(s == 60){
                            s = 0;
                            m++;
                            if(m == 60){
                                m = 0;
                                h++;
                            }
                        }
                    }
                }
            }
        }
    }
    public void alarma() throws InterruptedException{
    for(mil = 0;mil <= 10 ;mil++){
            Thread.sleep(1);
            System.out.println(h+":"+(60-m)+ ":"+(60-s)+":"+(10-dec)+":"+(10-cen)+":"+(10-mil));
            if (mil == 10){
                mil = 0;
                cen ++;
                if (cen == 10){
                    cen = 0;
                    dec++;
                    if (dec == 10){
                        dec = 0;
                        s++;
                        if(s == 60){
                            s = 0;
                            m++;
                            if(m == 60){
                                m = 0;
                                h++;
                            }
                        }
                    }
                }
            }
        }
    }
    
}


    
