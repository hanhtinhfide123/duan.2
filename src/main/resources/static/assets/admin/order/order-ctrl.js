app.controller("order-ctrl", function($scope, $http) {
    $scope.items = [];
    $scope.orderds = [];
    $scope.form = {};

    $scope.initialize = function() {
        $http.get("/rest/orderdetails").then(resp => {
            $scope.items = resp.data;
    
        });
     
        
        
 
    }
    $scope.initialize();
    $scope.reset = function() {
        $scope.form = {
  


        }
    }
    $scope.edit = function(item) {
        $scope.form = angular.copy(item);
        
        $(".nav-tabs a:eq(0)").tab('show');
        
    }
 	 $scope.delete = function(item) {
        $http.delete(`/rest/orderdetails/${item.id}`, item).then(resp => {
            var index = $scope.items.findIndex(p => p.id == item.id);
            $scope.items.splice(index, 1);
            $scope.reset();
            alert("xoa thanh cong");
        }).catch(error => {
            alert("Loi xoa san pham");
            console.log("Error", error);
        })
    }
    $scope.pager = {
        page: 0,
        size: 10,
        get items() {
            var start = this.page * this.size;
            return $scope.items.slice(start, start + this.size);
        },
        get count() {
            return Math.ceil(1 * $scope.items.length / this.size);
        },
        first() {
            this.page = 0;
        },
        prev() {
            this.page--;
            if (this.page < 0) {
                this.last();
            }
        },
        next() {
            this.page++;
            if (this.page >= this.count) {
                this.first();
            }
        },
        last() {
            this.page = this.count - 1;
        }
    }
     $scope.order = {
        createDate: new Date(),
        address: "",
        account: { username: $("#username").text() },
        get orderDetails() {
            return $scope.cart.items.map(item => {
                return {
                    product: { id: item.id },
                    price: item.price,
                    quantity: item.qty
                }
            });
        },
        purchase() {
            var order = angular.copy(this);
            $http.post("/rest/orders", order).then(resp => {
                alert("dat hang thanh cong");
                $scope.cart.clear();
                location.href = "/order/detail/" + resp.data.id;
            }).catch(error => {
                alert("dat hang loi");
                console.log(error)
            })
        }
    }
});