package TestSingletonPattern;


    public class TestSingleton {

        public static void main(String ar[]) {
            Test1 t = new Test1();
            /*Test1 t2 = new Test1();
            Test1 t3 = new Test1();*/
            Thread tt = new Thread(t);
            Thread tt2 = new Thread(t);
            Thread tt3 = new Thread(t);
            Thread tt4 = new Thread(t);

            tt.start();
            tt2.start();
            tt3.start();
            tt4.start();


        }
    }

     class Test1 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Test------------"+Thread.currentThread().getName());
                System.out.println(Single.getInstance().hashCode());;
                Single.getInstance().printCheck(Thread.currentThread().getName());


            }
        }

    }
    class Single {

        private final static Single sing = new Single();
        private Single() {
        }
        public static Single getInstance() {
            return sing;
        }
        void printCheck(String data){
            for (int i =0;i<20;i++){
                if(data.equals("Thread-0")){
                    try{
                        Thread.sleep(400);
                    }catch (InterruptedException e){
                        System.out.println("ggwp");
                    }

                }
                System.out.println(data);
            }
        }
    }



