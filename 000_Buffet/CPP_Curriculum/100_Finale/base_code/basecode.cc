// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char sym;
int i = 3;
int z = 4;
int r = 5;
cout<<"choose what symbol you want it to snow"<<endl;
cin>>sym;
cout<<endl;
while (true) {
gotoxy(3,i);
cout<<sym<<endl;
gotoxy(6,z);
cout<<sym<<endl;
gotoxy(9,i);
cout<<sym<<endl;
gotoxy(12,r);
cout<<sym<<endl;
gotoxy(15,z);
cout<<sym<<endl;
gotoxy(18,i);
cout<<sym<<endl;
gotoxy(21,r);
cout<<sym<<endl;
gotoxy(24,z);
cout<<sym<<endl;
gotoxy(27,r);
cout<<sym<<endl;
gotoxy(30,i);
cout<<sym<<endl;
gotoxy(3,i-1);
cout<<" "<<endl;
gotoxy(6,z-1);
cout<<"  "<<endl;
gotoxy(9,i-1);
cout<<" "<<endl;
gotoxy(12,r-1);
cout<<"  "<<endl;
gotoxy(15,z-1);
cout<<" "<<endl;
gotoxy(18,i-1);
cout<<"  "<<endl;
gotoxy(21,r-1);
cout<<" "<<endl;
gotoxy(24,z-1);
cout<<"  "<<endl;
gotoxy(27,r-1);
cout<<" "<<endl;
gotoxy(30,i-1);
cout<<"  "<<endl;
sleep(1);
i++;
	}
}