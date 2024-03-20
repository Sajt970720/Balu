import flet as ft

def main(page: ft.Page) -> None:

    def sajt(e):
        t2.value = e.control.value
        page.update()
    tb4 = ft.TextField(label="Név bekérés", hint_text="Kére adja meg ide a nevét", width=300, on_change=sajt)

    t2 = ft.Text()


    page.add(tb4,t2)
    page.update()

if __name__ =='__main__':
    ft.app(target=main)