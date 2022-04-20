var app = new Vue({
    el: "#app",
    data: {
        message: 'Hello!'
    },
    methods: {
        btnClick: function (event) {
            var deleteForm = Document.getElementById("btn");
            deleteForm.action= event.target.href;
            deleteForm.submit();
            event.preventDefault();
        }
    }
});
