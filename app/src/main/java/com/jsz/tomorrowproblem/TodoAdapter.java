package com.jsz.tomorrowproblem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {

    private final List<String> todos = new ArrayList<>();

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_todo_item, parent, false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        holder.update(todos.get(position));
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public void addItem(CharSequence todo) {
        todos.add(todo.toString());
        notifyDataSetChanged();
    }

    static class TodoViewHolder extends RecyclerView.ViewHolder {

        TodoViewHolder(View itemView) {
            super(itemView);
        }

        void update(String todo) {
            ((TextView) itemView).setText(todo);
        }
    }
}
