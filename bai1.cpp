#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Student{
	char hoTen[30];
	int tuoi;
	char lop[5];
}Student;
typedef struct node{
	Student data;
	struct node* pnext =  NULL;
}node;
typedef struct list{
	node* phead;
	node* ptail;
}list;
list linkList;
int createList(){
	linkList.phead = linkList.ptail = NULL;
}
Student createStudent(){
	Student student;
	printf("Ho ten : ");
	fflush(stdin);
	gets(student.hoTen);
	printf("Tuoi : ");
	scanf("%d",&student.tuoi);
	printf("Lop : ");
	fflush(stdin);
	gets(student.lop);
	return student;
}
node* createNode(){
	//cap phat bo nho
	node* pnode = (node*) malloc(sizeof(node));
	//gan du lieu cho data
	pnode->data = createStudent();
	//chi con tro pnode den null
	pnode->pnext = NULL;
	return pnode;
}
void addNodeToList(){
	if (linkList.phead == NULL){
		linkList.phead = linkList.ptail = createNode();
	}
	else{
		linkList.ptail->pnext = createNode();
		//linkList.ptail = createNode();
	}
}
void inputList(){
	int choose;
	while(1){
		printf("Nhap danh sach : \n");
		addNodeToList();
		printf("Ban co muon nhap tiep : \n 1. Nhap tiep\n 2. Thoat\n");
		scanf("%d",&choose);
		if (choose == 2){
			break;
		}
	}
}
void showList(){
	int stt = 1;
	printf("\t\t\tDANH SACH SINH VIEN\n");
	printf("| %3s | %20s | %10s | %5s | \n","STT","HO TEN","TUOI","LOP");
	for (node* tmp = linkList.phead ; tmp != NULL ; tmp = tmp->pnext){
		printf("| %3d | %20s | %10d | %5s | \n",stt,tmp->data.hoTen,tmp->data.tuoi,tmp->data.lop);
		stt++;
	}
}
void findName(){
	char findName[30];
	printf("Nhap ten can tim : ");
	fflush(stdin);
	gets(findName);
	printf("\t\t\tDANH SACH SINH VIEN\n");
	printf("| %20s | %10s | %5s | \n","HO TEN","TUOI","LOP");
	for (node* tmp = linkList.phead ; tmp != NULL ; tmp = tmp->pnext){
		if (strcmp(findName,tmp->data.hoTen) == 0){
			printf("| %20s | %10d | %5s | \n",tmp->data.hoTen,tmp->data.tuoi,tmp->data.lop);
		}
	}
}
void menu(){
	printf("Moi ban chon : \n");
	printf("1. Nhap danh sach \n");
	printf("2. Hien thi danh sach \n");
	printf("3. Tim kiem theo ten \n");
	printf("4. Thoat\n");
}
int main(){
	int choose;
	while(1){
		menu();
		scanf("%d",&choose);
		switch(choose){
			case 1 : {
				inputList();
				break;
			}
			case 2 : {
				showList();
				break;
			}
			case 3 :{
				findName();
				break;
			}
			case 4 :  return 0;
			default : break;
		}
	}
	return 0;
}

