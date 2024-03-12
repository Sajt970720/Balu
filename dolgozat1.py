import flet as ft

def main(page: ft.Page) -> None:

    szoveg_bal=ft.Container
    szoveg_job = ft.Container
    szoveg_bal=ft.Text(
        value= 'Hello'
    )
    szoveg_job=ft.Text(
        value='World',
        )
    alignment=ft.alignment.top_right,
    szoveg=ft.Text(
                    value= 'A',
                     )
    szovegdoboz= ft.Container(
                    alignment=ft.alignment.center,
                    bgcolor="blue",
                    height=200,
                    content=szoveg,
                   
    )
    negyzet1= ft.Container(
                    bgcolor="yellow",
                    height=200,
                    width= 200,
    )
    negyzet2= ft.Container(
                    bgcolor="blue",
                    height=200,
                    width= 200,
    )
    negyzet3= ft.Container(
                    bgcolor="grean",
                    height=200,
                    width= 200,
    )
    negyzet4= ft.Container(
                    bgcolor="dark",
                    height=200,
                    width= 200,
    )
    negyzet5= ft.Container(
                    bgcolor="red",
                    height=200,
                    width= 200,
    )
    sor=ft.Row(
        negyzet1,
        negyzet2,
        negyzet3,
        negyzet4,
        negyzet5,
    )
    




    
    

                    

    page.add( szoveg_bal,szoveg_job,szovegdoboz,sor)
 
    page.update()

if __name__ =='__main__':
    ft.app(target=main)