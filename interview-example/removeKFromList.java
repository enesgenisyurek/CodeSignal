// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> solution(ListNode<Integer> l, int k) {
    ListNode temp = l;

    if (l == null){
        return l;
    }

    while(l.value == k ){
        l = l.next;
        if (l == null)
            return l;  
    }

  
    while(temp.next != null){
        if (temp.next.value.equals(k)){
            temp.next = temp.next.next;
        }else{
            temp=temp.next;
        }
    }
    return l;

}
