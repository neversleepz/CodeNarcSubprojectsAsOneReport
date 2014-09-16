class MyClass {
    def y = 'x'
    def z = 'x'

    int getCount() {
        if (!ready) throw new Exception('Not ready')
    }
}