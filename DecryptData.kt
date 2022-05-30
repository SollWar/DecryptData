fun decryptData(price: IntArray, discount: Int, offset: Int, readLength: Int): IntArray? {
    return try {
        val resultList = price.sliceArray(offset..offset + (readLength - 1)).map {
            (it - (it * (discount / 100.0))).toInt()
        }
        resultList.toIntArray()
    } catch (e: Exception) {
        println(e.message)
        null
    }
}