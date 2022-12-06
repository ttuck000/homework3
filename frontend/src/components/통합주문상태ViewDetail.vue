<template>

    <v-card outlined>
        <v-card-title>
            통합주문상태 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Orderid" v-model="item.orderid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Orderstatus" v-model="item.orderstatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Customerid" v-model="item.customerid" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Qty" v-model="item.qty" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Deliverystatus" v-model="item.deliverystatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '통합주문상태ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/통합주문상태/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

