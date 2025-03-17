def MenaraHanoi(n, sumber, tujuan, bantu):
    if n == 1:
        print("Pindahkan cakram 1 dari", sumber, "ke", tujuan)
        return
    MenaraHanoi(n-1, sumber, bantu, tujuan)
    print("Pindahkan cakram", n, "dari", sumber, "ke", tujuan)
    MenaraHanoi(n-1, bantu, tujuan, sumber)

n = 4
MenaraHanoi(n, 'A', 'B', 'C')




