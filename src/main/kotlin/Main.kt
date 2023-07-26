fun main(){

//    //var 배열명 = Array<데이터 형식>(개수, {초기값})
//    var one = Array<Int>(4, {0})
//    var one2 =Array<Int>(4){0}

    ////////////////////////////////////////////////////////////////////////////////

//    //var 배열명 = ArrayList<데이터 형식>(개수)
//    var two = ArrayList<Int>(4)

    ////////////////////////////////////////////////////////////////////////////////

//    //배열을 바로 선언하고 값을 대입
//    var three : IntArray = intArrayOf(1, 2, 3)

    ////////////////////////////////////////////////////////////////////////////////

    //var 배열명 = Array<데이터 형식>(행의 개수, {배열 데이터 형식(열의 개수, {초기값})})
//    var four = Array<IntArray>(3, {IntArray(4, {0})})
//    var four2 = Array<Array<Int>>(3){Array<Int>(4){0} }

    ////////////////////////////////////////////////////////////////////////////////

    var five = Array<IntArray>(3, {i->IntArray(4, {j-> j + i*4})})
    var six = Array<Array<Int>>(3){i->Array<Int>(4){j -> j + i*4 } }
        //출력값

    for ((a, row) in six.withIndex()){
        for ((j,column) in row.withIndex()){
            //println(j)
            print("[$a,$j] => $column")
        }
        print("\n")
    }

////////////////////////////////////////////////////////////////////////////////

//    //3차원 배열
//    var seven = Array(5){Array(5){Array(5){1} } }

////////////////////////////////////////////////////////////////////////////////
//반복문 for, while
////////////////////////////////////////////////////////////////////////////////

//    var a : IntArray = intArrayOf(10, 20, 30)
//    var a2 : Array<Int> = arrayOf(10, 20, 30)
//
//    // indices: 배열의 인덱스를 반환
//    for (i in a.indices){
//        println(a[i])
//    }
//
//    for (value in a){
//        println(value)
//    }

    ////////////////////////////////////////////////////////////////////////////////

//    val b : Array<String> = arrayOf("하나, 둘, 셋")
//
//    for (i in 0..2 step 1)
//        println(b[i])
//
//    var k : Int = 0
//    while(k < b.size){
//        println(b[k])
//        k++
//    }



}















//    var five :IntArray = intArrayOf(1,2,3)