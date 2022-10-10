package pt.isel

enum class Month(val monthNumber: Int) {
    JANUARY(1) {
        override fun nextMonth() = FEBRUARY
               },
    FEBRUARY(2) {
        override fun nextMonth() = MARCH
                },
    MARCH(3){
        override fun nextMonth() = APRIL
    },
    APRIL(4){
        override fun nextMonth() = MAY
    },
    MAY(5){
        override fun nextMonth() = JUNE
    },
    JUNE(6){
        override fun nextMonth() = JULY
    },
    JULY(7){
        override fun nextMonth() = AUGUST
    },
    AUGUST(8){
        override fun nextMonth() = SEPTEMBER
    },
    SEPTEMBER(9){
        override fun nextMonth() = OCTOBER
    },
    OCTOBER(10){
        override fun nextMonth() = NOVEMBER
    },
    NOVEMBER(11){
        override fun nextMonth() = DECEMBER
    },
    DECEMBER(12){
        override fun nextMonth() = JANUARY
    };

    abstract fun nextMonth() : Month

}