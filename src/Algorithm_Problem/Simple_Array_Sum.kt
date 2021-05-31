package Algorithm_Problem

import java.util.*


class Simple_Array_Sum {

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            val arCount = sc.next().trim { it <= ' ' }.toInt()

            val ar: MutableList<Int> = ArrayList()

            for (i in 0 until arCount) {
                val arItem = sc.nextInt()
                ar.add(arItem)
            }

            val result: Int = simpleArraySum(ar)
            println(result)
        }

        private fun simpleArraySum(ar: MutableList<Int>): Int {
            var sum = 0
            for (i in ar){
                sum += i
            }
            return sum
        }
    }

}



