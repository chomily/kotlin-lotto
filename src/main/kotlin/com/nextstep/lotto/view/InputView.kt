package com.nextstep.lotto.view

class InputView {

    fun inputAmount(): Int {
        println("구입금액을 입력해 주세요.")
        return readLine()!!.toInt()
    }
}