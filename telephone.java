import java.util.*; 
class telephone{ 
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        switch(a){
            case 0: 
                switch(b){ 
                    case 0: System.out.println('&');
                    break;
                    case 1: System.out.println('/');
                    break;
                }
                break;
                case 1: 
                switch(b){ 
                    case 1:
                        System.out.println(' ');
                        break;
                    case 2: System.out.println('.');
                        break;
                    case 3: System.out.println('?');
                        break; 
                }
                break;
                case 2:
                switch(b){ 
                    case 1: System.out.println('A');
                        break;
                    case 2: System.out.println('B');
                        break;
                    case 3: System.out.println('C');
                        break;
                }
                break;
                case 3: 
                switch(b){ 
                    case 1: System.out.println('D');
                        break;
                    case 2: System.out.println('E');
                        break;
                    case 3: System.out.println('F');
                        break;
                }
                break;
                case 4: 
                switch(b){ 
                    case 1: System.out.println('G');
                        break;
                    case 2: System.out.println('H');
                        break;
                    case 3: System.out.println('I');
                        break;
                }
                break;
                case 5: 
                switch(b){ 
                    case 1: System.out.println('J');
                        break;
                    case 2: System.out.println('K');
                        break;
                    case 3: System.out.println('L');
                        break;
                }
                case 6:
                switch(b){ 
                    case 1: System.out.println('M');
                        break;
                    case 2: System.out.println('N');
                        break;
                    case 3: System.out.println('O');
                        break;
                } 
                break;
                case 7:
                switch(b){ 
                    case 1: System.out.println("P");
                        break;
                    case 2: System.out.println('Q');
                        break;
                    case 3: System.out.println('R');
                        break;
                }
                break;
                case 8: 
                switch(b){ 
                    case 1: System.out.println('S');
                        break;
                    case 2: System.out.println('T');
                        break;
                    case 3: System.out.println('U');
                        break;
                }
                break;
                case 9: 
                switch(b){ 
                    case 1: System.out.println('V');
                        break;
                    case 2: System.out.println('W');
                        break;
                    case 3: System.out.println('X');
                        break;
                    case 4: System.out.println('Y');
                        break;
                    case 5: System.out.println('Z');
                        break;
                }
                break;
            default: System.out.println(" not there sry mayne 🥺🥺🥺[ have some cringe emojis] ");
            }
        }
}