package com.nextstep.lotto.domain

class LottoTicket(numbers: List<LottoBall>) {

    init {
        require(numbers.size == 6) { "6개의 LottoBall 을 입력받아야 합니다. size: ${numbers.size}" }
        require(numbers.toSet().size == 6) {
            println("사이즈" + setOf(numbers).size)
            "중복된 LottoBall 을 입력받을 수 없습니다. numbers: $numbers"
        }
    }
}