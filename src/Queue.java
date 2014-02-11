/**
 * User: che
 * Date: 11.02.14
 * Time: 8:26
 */
class Queue {
    char q[]; //массив для хранения данных очереди
    int putloc, getloc; //индекс добавления и извлечения даннх

    Queue(int size){
        q = new char[ size +1]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    //включение элемента в очередь
    void put(char ch) {
        if (putloc == q.length-1){
            System.out.println(" - Queue is full.");
            return;
        }
        putloc++;
        q[ putloc] = ch;
    }


    //извлечение элементиа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        getloc++;
        return q[ getloc];
    }
}
